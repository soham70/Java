#include <iostream>
#include <fstream>
#include <sstream>
#include <vector>
#include <unordered_map>
#include <iomanip>
#include <ctime>

struct EmployeeStats
{
    std::string position_id;
    int consecutive_days;
    std::tm previous_shift_end;
    std::vector<std::tm> long_shifts;
};

void analyzeEmployeeData(const std::string &filename)
{
    std::ifstream file(filename);
    if (!file.is_open())
    {
        std::cerr << "Error opening file: " << filename << std::endl;
        return;
    }

    std::vector<std::unordered_map<std::string, std::string>> employeeData;

    std::string line;
    while (std::getline(file, line))
    {
        std::istringstream iss(line);
        std::unordered_map<std::string, std::string> row;
        std::string field;

        while (std::getline(iss, field, ','))
        {
            size_t pos = field.find_first_of("\"");
            if (pos != std::string::npos)
            {
                std::string temp = field.substr(pos + 1);
                std::getline(iss, field, '\"');
                temp += "," + field;
                field = temp;
            }
            row[field.substr(0, field.find(':'))] = field.substr(field.find(':') + 1);
        }

        employeeData.push_back(row);
    }

    std::unordered_map<std::string, EmployeeStats> employeeStats;

    for (const auto &row : employeeData)
    {
        std::string employeeName = row.at("Employee Name");
        std::string positionId = row.at("Position ID");
        std::string timeIn = row.at("Time");
        std::string timeOut = row.at("Time Out");

        if (!timeIn.empty() && !timeOut.empty())
        {
            try
            {
                std::tm current_time = {};
                std::tm current_time_out = {};

                std::istringstream timeInStream(timeIn);
                std::istringstream timeOutStream(timeOut);

                timeInStream >> std::get_time(&current_time, "%m/%d/%Y %I:%M %p");
                timeOutStream >> std::get_time(&current_time_out, "%m/%d/%Y %I:%M %p");

                // Calculate consecutive workdays
                if (employeeStats[employeeName].previous_shift_end.tm_year == 0 ||
                    std::difftime(std::mktime(&current_time), std::mktime(&employeeStats[employeeName].previous_shift_end)) / 86400 == 1)
                {
                    employeeStats[employeeName].consecutive_days++;
                }
                else
                {
                    employeeStats[employeeName].consecutive_days = 1;
                }
                employeeStats[employeeName].previous_shift_end = current_time_out;

                // Print findings for 7 consecutive days
                if (employeeStats[employeeName].consecutive_days == 7)
                {
                    std::cout << "a) Employee " << employeeName << " (Position ID: " << positionId << ") has worked 7 consecutive days." << std::endl;
                }

                // Check for less than 10 hours between shifts
                if (employeeStats[employeeName].previous_shift_end.tm_year != 0 &&
                    1 < std::difftime(std::mktime(&current_time), std::mktime(&employeeStats[employeeName].previous_shift_end)) / 3600 &&
                    std::difftime(std::mktime(&current_time), std::mktime(&employeeStats[employeeName].previous_shift_end)) / 3600 < 10)
                {
                    std::cout << "b) Employee " << employeeName << " (Position ID: " << positionId << " has less than 10 hours between shifts." << std::endl;
                }

                // Print findings for long shifts
                std::time_t shift_duration_seconds = std::difftime(std::mktime(&current_time_out), std::mktime(&current_time));
                if (shift_duration_seconds / 3600 > 14)
                {
                    employeeStats[employeeName].long_shifts.push_back(current_time_out);
                    std::cout << "c) Employee " << employeeName << " (Position ID: " << positionId << ") has worked a shift longer than 14 hours." << std::endl;
                }
            }
            catch (const std::exception &e)
            {
                std::cerr << "Error parsing time in row: " << employeeName << std::endl;
                std::cerr << e.what() << std::endl;
                continue;
            }
        }
    }
}

int main()
{
    std::string filename = "Assignment_Timecard.xlsx - Sheet1.csv"; // Replace with your actual filename
    analyzeEmployeeData(filename);

    return 0;
}
