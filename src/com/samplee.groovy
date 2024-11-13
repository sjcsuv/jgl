pipeline {
    agent any
    stages {
        stage('Setup') {
            steps {
                echo 'Starting the Pipeline...'
            }
        }
        stage('Create File') {
            steps {
                echo 'Creating a sample file...'
                script {
                    if (isUnix()) {
                        sh 'touch sample.txt'
                    } else {
                        bat 'echo Sample content > sample.txt'
                    }
                }
            }
        }
        stage('Read File') {
            steps {
                script {
                    if (isUnix()) {
                        sh 'cat sample.txt'
                    } else {
                        bat 'type sample.txt'
                    }
                }
            }
        }
    }
    post {
        always {
            echo 'Pipeline completed.'
        }
    }
}

