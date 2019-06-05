#!/usr/bin/env groovy
// vars/jenkinsPythonInstall.groovy

// Description: This funtion installs the Python version we wish to use across all Jenkinsfile's that need to run Python   
// Written by: Martin Woods - martinwoods.ie@gmail.com

def call(PYTHON_VERSION) {

    sh """
        apt-get -y update
        apt-get -y upgrade
        apt-get -y dist-upgrade
        apt-get install -y build-essential checkinstall python-dev python-setuptools python-pip python-smbus
        apt-get install -y libreadline-gplv2-dev libncursesw5-dev libssl-dev libgdbm-dev libc6-dev libbz2-dev
        apt-get install -y zlib1g-dev libsqlite3-dev tk-dev
        apt-get install -y libssl-dev openssl
        apt-get install -y libffi-dev

        cd /usr/src
        wget https://www.python.org/ftp/python/${PYTHON_VERSION}/Python-${PYTHON_VERSION}.tgz
        tar xzf Python-${PYTHON_VERSION}.tgz
        cd /usr/src/Python-${PYTHON_VERSION}
        ./configure --enable-optimizations
        make altinstall
    """
}
