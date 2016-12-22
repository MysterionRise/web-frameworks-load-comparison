#!/bin/bash 
ab -c 5000 -n 5000000 http://localhost:8080/ping
