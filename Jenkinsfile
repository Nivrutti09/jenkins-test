pipeline {
    agent any

    tools {
        maven "mvn3.9"
        jdk "jdk11"
    }

    stages {
        stage('Build') { 
            steps {
               echo 'build'
            }
        }
        stage('Test') { 
            steps {
               echo 'test'
            }
        }
        stage('Deploy') { 
            steps {
               echo 'deploy'
            }
        }
     }
}


