#!/usr/bin/env bash
set -euo pipefail

cd "$(dirname "$0")/.."
mkdir -p out
javac -encoding UTF-8 -d out src/*.java tests/*.java

for prueba in tests/*Test.java; do
    clase=$(basename "$prueba" .java)
    java -cp out "$clase"
done
