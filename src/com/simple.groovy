pipeline {
    agent any
    
    stages {
        stage('Initialize') {
            steps {
                echo 'Starting the Pipeline...'
            }
        }
        
        stage('Create File') {
            steps {
                echo 'Creating a sample file...'
                // This creates a file named "sample.txt" with some text
                sh 'echo "Hello, Jenkins Pipeline!" > sample.txt'
            }
        }
        
        stage('Read File') {
            steps {
                echo 'Reading the contents of the file...'
                // This displays the contents of the created file
                sh 'cat sample.txt'
            }
        }
    }

    post {
        always {
            echo 'Pipeline completed.'
        }
    }
}

