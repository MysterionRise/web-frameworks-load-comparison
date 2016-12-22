#!/bin/bash 
ab -s 120 -c 1000 -n 1000000 -r http://localhost:8080/ping
