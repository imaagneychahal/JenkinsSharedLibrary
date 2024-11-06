def call(String imageName, String tag, String registry) {
    sh "docker build -t ${imageName}:${tag} ."
    sh "docker tag ${imageName}:${tag} ${registry}/${imageName}:${tag}"
}
