cmake_minimum_required(VERSION 4.1)
project(09_funcs C)

set(CMAKE_C_STANDARD 99)

add_executable(09_funcs main.c
        funcs.c
        funcs.h
        varGlobais.c
        varGlobais.h)
