#!/usr/bin/env groovy
// vars/jenkinsFabricCaClientInstall.groovy

// Description: This funtion installs the Fabric CA Client   
// Written by: Martin Woods - martin@aid.technology

def call(HLF_TOOLS_BUILD_CA) {
    // Fabric CA Client Install
    sh """
        mkdir -p /var/hyperledger/fabric-ca/
        chmod -R +x /var/hyperledger/fabric-ca/
        curl -f -s -C - https://nexus.hyperledger.org/content/repositories/releases/org/hyperledger/fabric-ca/hyperledger-fabric-ca/${HLF_TOOLS_BUILD_CA}/hyperledger-fabric-ca-${HLF_TOOLS_BUILD_CA}.tar.gz > /var/hyperledger/fabric-ca/fabric-ca-${HLF_TOOLS_BUILD}.tar.gz
        chmod +x /var/hyperledger/fabric-ca/fabric-ca-${HLF_TOOLS_BUILD_CA}.tar.gz
        tar -xvf /var/hyperledger/fabric-ca/fabric-ca-${HLF_TOOLS_BUILD_CA}.tar.gz -C /var/hyperledger/fabric-ca/
        cp /var/hyperledger/fabric-ca/bin/fabric-ca-client /usr/local/bin/
    """
}