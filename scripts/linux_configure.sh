#!/bin/bash

set -o errexit
set -o nounset

# Set the LD_LIBRARY_PATH to the temp directory
echo 'export LD_LIBRARY_PATH=$TMPDIR' >> ~/.bash_profile

# Set folder name for zeromq libraries
echo 'export ZMQ_LIBS=lib-zeromq-bin/' >> ~/.bash_profile

# Add lib-zeromq-bin path to 'PATH' variable
echo 'export PATH=$PATH:$TMPDIR$ZMQ_LIBS' >> ~/.bash_profile

echo 'Done'
