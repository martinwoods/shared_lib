#!/usr/bin/env groovy
// vars/jenkinsTerraformExportValues.groovy

// Description: This method is used to export Terraform Values to the shell session
// Written by: Martin Woods - martin@aid.technology

def call(shellParam) {
    sh """
        export RESOURCE_GROUP=${RESOURCE_GROUP}
        export SQL_SERVER=${AZURE_SQL_SERVER}
        export SQL_DB=${AZURE_SQL_DB}
        export ARM_CLIENT_ID=${ARM_CLIENT_ID}
        export ARM_CLIENT_SECRET=${ARM_CLIENT_SECRET}
        export ARM_TENANT_ID=${ARM_TENANT_ID}
        export ARM_SUBSCRIPTION_ID=${ARM_SUBSCRIPTION_ID}
        cd ${TERRAFORM_SQLS_DIR}
        $shellParam     
    """
}            
