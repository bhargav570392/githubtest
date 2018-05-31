
#!/usr/bin/env groovy

node ('master'){
  
        properties([pipelineTriggers([[$class: 'GitHubPushTrigger']])])
  
  stage('Checkout')
    {
        checkout([$class: 'GitSCM', branches: [[name: '*/master']], doGenerateSubmoduleConfigurations: false, extensions: [], submoduleCfg: [], userRemoteConfigs: [[url: 'https://github.com/bhargav570392/githubtest.git']]])
    }
 
      
  
}
