node {
    try {
        stage('Initialize') {
            echo 'Starting the Pipeline...'
        }
        
        stage('Create File') {
            echo 'Creating a sample file...'
            // This creates a file named "sample.txt" with some text
            sh 'echo "Hello, Jenkins Pipeline!" > samplee.txt'
        }
        
        stage('Read File') {
            echo 'Reading the contents of the file...'
            // This displays the contents of the created file
            sh 'cat samplee.txt'
        }
    } finally {
        echo 'Pipeline completed.'
    }
}

