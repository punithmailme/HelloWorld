#!/bin/bash

set -o errexit
set -o nounset

# Set folder name for zeromq libraries
echo 'export ZMQ_LIBS=lib-zeromq-bin/' >> ~/.bash_profile

# Set the DYLD_LIBRARY_PATH to the zeromq libraries in temp directory
echo 'export DYLD_LIBRARY_PATH=$TMPDIR$ZMQ_LIBS' >> ~/.bash_profile

# Add DYLD_LIBRARY_PATH to 'PATH' variable
echo 'export PATH=$PATH:$DYLD_LIBRARY_PATH' >> ~/.bash_profile

echo 'Done'
