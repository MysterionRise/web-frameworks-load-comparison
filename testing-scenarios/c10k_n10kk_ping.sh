#!/bin/bash 
ab -c 10000 -n 10000000 http://localhost:8080/ping
