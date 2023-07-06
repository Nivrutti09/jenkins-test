pipeline {
    agent any

    tools {
        maven "mvn3.6"
        jdk "jdk8"
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


