node
{
    stage('Checkout')
    {
        checkout([$class: 'GitSCM', branches: [[name: '*/master']], doGenerateSubmoduleConfigurations: false, extensions: [], submoduleCfg: [], userRemoteConfigs: [[url: 'https://github.com/bhargav570392/githubtest.git']]])
    }
    
    
    stage('Test') {
            steps {
                echo 'Testing..'
            }
        }
        stage('Deploy') {
            steps {
                echo 'Deploying....'
            }
            }
    stage('Push') {
            steps {
               curl http://http://18.219.75.122:8080//git/notifyCommit?url=https://github.com/bhargav570392/githubtest[&branches=branch1[,branch2]*][&sha1=<commit ID>]
            }
            }
}
