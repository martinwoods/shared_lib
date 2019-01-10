#!/usr/bin/env groovy
// vars/jenkinsAptUpdateUpgrade.groovy

/* 
Description:

apt-get update: updates the list of available packages and their versions, 
ut it does not install or upgrade any packages.

apt-get upgrade: actually installs newer versions of the packages you have. 
After updating the lists, the package manager knows about available updates for the software you have installed.

Written by: Martin Woods - martin@aid.technology
 */


def call() {
    sh "apt update -y && apt upgrade -y"
}