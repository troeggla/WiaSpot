#!/bin/bash

if [ $# -eq 2 ]; then
  adb shell "su 0 date 0101${1}${2}"
elif [ $# -eq 4 ]; then
  adb shell "su 0 date ${3}${4}${1}${2}"
else
  echo "USAGE: $0 HH MM [DD MM]"
  exit 1
fi
