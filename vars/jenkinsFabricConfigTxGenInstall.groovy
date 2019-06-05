#!/usr/bin/env groovy
// vars/jenkinsFabricConfigTxGenInstall.groovy

// Description: This funtion installs the Fabric configtxgen  
// Written by: Martin Woods - martinwoods.ie@gmail.com

def call(HLF_TOOLS_BUILD) {
    // Fabric configtxgen Install
    sh """
        mkdir -p /var/hyperledger/fabric/
        chmod -R +x /var/hyperledger/fabric/
        curl -f -s -C - https://nexus.hyperledger.org/content/repositories/releases/org/hyperledger/fabric/hyperledger-fabric/${HLF_TOOLS_BUILD}/hyperledger-fabric-${HLF_TOOLS_BUILD}.tar.gz > /var/hyperledger/fabric/fabric-${HLF_TOOLS_BUILD}.tar.gz
        tar -xvf /var/hyperledger/fabric/fabric-${HLF_TOOLS_BUILD}.tar.gz -C /var/hyperledger/fabric/
        cp /var/hyperledger/fabric/bin/* /usr/local/bin/
    """
}