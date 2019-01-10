// Jenkinsfile
// Description: To deploy Donation SMS, API & Frontend   
// Written by: Martin Woods - martin@aid.technology

// Import Shared Library
@Library('jenkins-shared-lib@subtask_DO-171')_

// Groovy vars defind outside the declarative pipeline
def pythonSetupDonationAppScript = " \
                    python\${PYTHON_COMMAND_VERSION} -V \
                    cd \${WORKSPACE} \
                    python\${PYTHON_COMMAND_VERSION} -m pip install -r ./requirements.txt \
                    echo \$PYTHONPATH \
                    export PYTHONPATH=\$PATH:\$(pwd) \
                    echo \$PYTHONPATH \
                    python\${PYTHON_COMMAND_VERSION} ./hlf/setup_da.py -v -e qa -f ./\${DEPLOYMENT}/\${PROJECT}/hlf_qa/hlf_config.yaml \
                    "

pipeline {
    
    agent any

    options {
        // Disallow concurrent executions of the Pipeline   
        disableConcurrentBuilds()
    }

    // Environmet Specific Data
    environment {
        DEPLOYMENT = "test_deployments"
        PROJECT = "mmc_dev"
        ENVIRONMENT = "qa"
        TWILIO_PHONE_NUMBER = "+353861801300"
        HELM_VERSION="v2.11.0"
        PYTHON_VERSION="3.7.0"
        PYTHON_COMMAND_VERSION="3.7"
    }

    stages {

        // Clean Workspace
        stage('Clean Workspace') {
             steps {
                deleteDir() /* clean up our workspace */
            }
        }

        // Checking code out from GitHub
        stage('Checkout from SCM') {
            steps {
                git url: "https://github.com/aidtechnology/deployer.git", 
                branch: 'DO-87-Jenkinsfile', 
                credentialsId: 'jx-pipeline-git-github-github'
            }
        }

        // Installed Required Applications used by the Pipeline
        stage ('Install Applications') {
            steps {
                script {
                    jenkinsHelmInstall '${HELM_VERSION}'
                    jenkinsPythonInstall '${PYTHON_VERSION}'
                }

            }
        }

        // Install Donation SMS, API and Front-End
        stage ('donation-sms-api-fe') {
            steps {
              script {
                jenkinsSecretCredentials(pythonSetupDonationAppScript) 
              }
            }
        }
    }
}