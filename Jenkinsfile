
#!/usr/bin/env groovy

node ('master'){
    stage('Build and Test') {
        properties([pipelineTriggers([[$class: 'GitHubPushTrigger']])])
        checkout scm
      
    }
}
