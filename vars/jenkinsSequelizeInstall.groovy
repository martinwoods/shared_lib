#!/usr/bin/env groovy
// vars/jenkinsSequelizeInstall.groovy

// Description: This method is used to install Sequelize
// Written by: Martin Woods - martin@aid.technology

def call() {
    sh"""
        npm install -g sequelize-cli ; \
        npm install --save sequelize-cli ; \
        npm install sequelize ; \
        npm install --save sequelize ; \
        which sequelize ; \
        sequelize --version
    """
}                            
