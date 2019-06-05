#!/usr/bin/env groovy
// vars/jenkinsTerraformInstall.groovy

// Description: This method is used to install Terraform
// Written by: Martin Woods - martinwoods.ie@gmail.com

def call() {
    sh"""
        rm -rf /tmp/terraform* ; \
        cd /tmp/ ; \
        wget https://releases.hashicorp.com/terraform/${TERRAFORM_VERSION}/terraform_${TERRAFORM_VERSION}_linux_amd64.zip -P /tmp/ ; \
        unzip /tmp/terraform*.zip -d /tmp/ ; \
        mv /tmp/terraform /usr/local/bin/ && chmod +x /usr/local/bin/terraform ; \
        terraform --version ;
    """
}
