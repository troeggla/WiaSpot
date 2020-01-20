#!/bin/bash

if [ $# -eq 2 ]; then
  adb shell "su 0 date 0101${1}${2}"
elif [ $# -eq 4 ]; then
  adb shell "su 0 date ${3}${4}${1}${2}"
else
  now=`date +%m%d%H%M%Y.%S`
  adb shell "su 0 date ${now}"
fi
