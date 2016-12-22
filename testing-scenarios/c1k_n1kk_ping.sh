#!/bin/bash 
ab -c 1000 -n 1000000 http://localhost:8080/ping
