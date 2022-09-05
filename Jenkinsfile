pipeline {
  agents any
  stages {
    stage('Build'){
      steps{
        echo 'Buildning...'
      }
    }
    stage {
      steps('Build test'){
        echo 'Testing...'
      }
    }
    stage {
      steps('Deploy'){
        echo 'Deploy...'
      }
    }
  }
}
