#!/bin/bash 
ab -s 120 -c 10000 -n 10000000 -r http://localhost:8080/ping
