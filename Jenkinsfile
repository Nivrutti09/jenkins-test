pipeline {
    agent any

    tools {
        maven "mvn3.9"
        jdk "jdk11"
    }

    stages {
        
        stage('Initialize'){
            steps{
                echo "PATH = ${M2_HOME}/bin:${PATH}"
                echo "M2_HOME = /opt/maven"
            }
        }
        
        stage('Build') {
            steps {
                dir("/home/ubuntu/.jenkins/workspace/pipeline") {
                sh 'mvn clean package'
                }
            
         } 
         
         stage('Deploy') {
            steps {
                echo 'deploy'
                }
            
         } 
         
         
        }
     }
}


