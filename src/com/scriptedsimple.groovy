node {
    try {
        stage('Initialize') {
            echo 'Starting the Pipeline...'
        }

        stage('Create File') {
            echo 'Creating a sample file...'
            // This creates a file named "sample.txt" with some text
            script {
                if (isUnix()) {
                    sh 'echo "Hello, Jenkins Pipeline!" > sample.txt'
                } else {
                    bat 'echo "Hello, Jenkins Pipeline!" > sample.txt'
                }
            }
        }

        stage('Read File') {
            echo 'Reading the contents of the file...'
            // This displays the contents of the created file
            script {
                if (isUnix()) {
                    sh 'cat sample.txt'
                } else {
                    bat 'type sample.txt'
                }
            }
        }
    } finally {
        echo 'Pipeline completed.'
    }
}

