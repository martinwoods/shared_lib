#!/usr/bin/env groovy
// vars/jenkinsPythonPathInput.groovy

// Description: This method excepts as input python script while setting the PYTHONPATH
// Written by: Martin Woods - martinwoods.ie@gmail.com

def call(pythonScriptInput) {
    sh """
        export PYTHONPATH=\"\$(find ${WORKSPACE}/ -maxdepth 4 -type d | sed '/\\./d' | tr '\\n' ':' | sed 's/:\$//')\"
        $pythonScriptInput 
    """
}
