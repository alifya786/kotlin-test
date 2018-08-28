package TeamcityTest.vcsRoots

import jetbrains.buildServer.configs.kotlin.v2018_1.*
import jetbrains.buildServer.configs.kotlin.v2018_1.vcs.GitVcsRoot

object TeamcityTest_HttpsGitlabTableausoftwareComBpunTeamcityTestGitRefsHeadsMaster : GitVcsRoot({
    name = "https://github.com/alifya786/kotlin-test.git#refs/heads/master"
    url = "https://github.com/alifya786/kotlin-test.git"
    branchSpec = "+:refs/heads/(master)"
    authMethod = password {
        userName = "alifya786"
        password = "Jabeen23."
    }
})
