#!/usr/bin/env groovy
// vars/jenkinsSecretCredentials.groovy

// Description: This method returns a list of hidden secret credentials using the withCredentials plugin
// Written by: Martin Woods - martinwoods.ie@gmail.com

def call(Closure inputData) {
    withCredentials ([string(credentialsId: 'jenkins-openexchanges-api-id', variable: 'OPENEXCHANGES_API_ID'), 
                            string(credentialsId: 'jenkins-newrelic-license', variable: 'NEWRELIC_LICENSE'), 
                            string(credentialsId: 'jenkins-sendgrid-key', variable: 'SENDGRID_KEY'),
                            string(credentialsId: 'jenkins-sendgrid-notification-email-template', variable: 'SENDGRID_KEY'),
                            string(credentialsId: 'jenkins-sendgrid-reset-email-template', variable: 'SENDGRID_KEY'),
                            string(credentialsId: 'jenkins-sendgrid-spend-email-template', variable: 'SENDGRID_KEY'),
                            string(credentialsId: 'jenkins-sendgrid-verification-email-template', variable: 'SENDGRID_KEY'),
                            string(credentialsId: 'jenkins-sendgrid-verification-reset-email-template', variable: 'SENDGRID_KEY'),
                            string(credentialsId: 'jenkins-azure-db-password', variable: 'TWILIO_ACCOUNT_SID'), 
                            string(credentialsId: 'jenkins-twilio-auth-token', variable: 'TWILIO_AUTH_TOKEN'),
                            string(credentialsId: 'jenkins-twilio-sid-test', variable: 'TWILIO_TEST_SID'),
                            string(credentialsId: 'jenkins-twilio-auth-token-test', variable: 'TWILIO_TEST_AUTH_TOKEN'),
                            string(credentialsId: 'jenkins-twilio-phone-test', variable: 'TWILIO_TEST_PHONE'),
                            string(credentialsId: 'jenkins-azure-sql-password-martinmanagedcluster-qa-sqlserver', variable: 'AZURE_SQL_PASSWORD'),
                            usernamePassword(credentialsId: 'jenkins-stripe-client-id-stripe-secret', 
                            passwordVariable: 'STRIPE_SECRET', 
                            usernameVariable: 'STRIPE_CLIENT_ID'),
                            string(credentialsId: 'jenkins-stripe-public-test', variable: 'STRIPE_TEST_PUBLIC'),
                            string(credentialsId: 'jenkins-stripe-secret-test', variable: 'STRIPE_TEST_SECRET'),
                            string(credentialsId: 'jenkins-stripe-client-test', variable: 'STRIPE_TEST_CLIENT_ID'),
                            string(credentialsId: 'jenkins-azure-db-password', variable: 'AZURE_DB_PASSWORD'),
                            string(credentialsId: 'jenkins-azure-storage-key', variable: 'AZURE_STORAGE_KEY'),
                            string(credentialsId: 'jenkins-hlf-api-key', variable: 'HLF_API_KEY'),
                            string(credentialsId: 'jenkins-arm-client-id', variable: 'ARM_CLIENT_ID'),
                            string(credentialsId: 'jenkins-arm-client-secret', variable: 'ARM_CLIENT_SECRET'),
                            string(credentialsId: 'jenkins-arm-tenant-id', variable: 'ARM_TENANT_ID'),
                            string(credentialsId: 'jenkins-arm-subscription-id', variable: 'ARM_SUBSCRIPTION_ID'),
                            string(credentialsId: 'jenkins-terraform-storage-access-key', variable: 'TERRAFORM_STORAGE_ACCESS_KEY'),
                            usernamePassword(credentialsId: 'jenkins-chartmuseum-user-pass', 
                            passwordVariable: 'CHARTMUSEUM_PASS', 
                            usernameVariable: 'CHARTMUSEUM_USER')]){
                               inputData()
                            }
    }

return this
