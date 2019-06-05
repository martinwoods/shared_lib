#!/usr/bin/env groovy
// vars/jenkinsNvmNodejsInstall.groovy

// Description: This method is used to install NVM node version manager and Node js
// Written by: Martin Woods - martinwoods.ie@gmail.com

def call() {
    sh"""
        apt-get -y install software-properties-common ; \
        cd /etc/apt/sources.list.d && rm -rf * ; \
        curl -sL https://deb.nodesource.com/setup_10.x | bash - ; \
        apt-get -y install build-essential libssl-dev ; \
        curl https://raw.githubusercontent.com/creationix/nvm/v0.33.11/install.sh | bash ; \
        . ~/.nvm/nvm.sh ; \
        . ~/.profile ; \
        . ~/.bashrc ; \
        nvm ; \
        export NVM_DIR=\"\${XDG_CONFIG_HOME/:-\$HOME/.}nvm\" ; \
        echo \$NVM_DIR ; \
        nvm --version ; \
        apt-get install -y nodejs ;
    """
}

