#!/usr/bin/env groovy
// vars/jenkinsStageApproval.groovy

// Description: This method is used to add confirmation message to a pipeline stage
// Written by: Martin Woods - martinwoods.ie@gmail.com

def call() {
    script {
        def userInput = input(id: 'confirm', 
        message: 'Apply Terraform?', 
        parameters: [ [$class: 'BooleanParameterDefinition', 
        defaultValue: false, 
        description: 'Apply terraform', 
        name: 'confirm'] ])
    }
}