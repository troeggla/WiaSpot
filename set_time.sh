#!/bin/bash

if [ $# -ne 2 ]; then
  echo "USAGE: $0 HH MM"
  exit 1
fi

adb shell "su 0 date 0101${1}${2}"
