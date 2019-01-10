#!/usr/bin/env groovy
// vars/jenkinsSequelizeExportValues.groovy

// Description: This funtion exports values for Sequelize
// Written by: Martin Woods - martin@aid.technology

def call(shellParam) {
    sh """
        export AZURE_SQL_USER=${AZURE_SQL_USER}
        export AZURE_SQL_SERVER=${AZURE_SQL_SERVER}
        export AZURE_SQL_DB=${AZURE_SQL_DB}
        export AZURE_SQL_PASSWORD=${AZURE_SQL_PASSWORD}
        npm install
        $shellParam"""
}
