package TeamcityTestCommon

import jetbrains.buildServer.configs.kotlin.v2018_1.vcs.GitVcsRoot
import jetbrains.buildServer.configs.kotlin.v2018_1.*
import jetbrains.buildServer.configs.kotlin.v2018_1.Project
import jetbrains.buildServer.configs.kotlin.v2018_1.projectFeatures.VersionedSettings
import jetbrains.buildServer.configs.kotlin.v2018_1.projectFeatures.versionedSettings

import jetbrains.buildServer.configs.kotlin.v2018_1.buildSteps.gradle
import jetbrains.buildServer.configs.kotlin.v2018_1.triggers.vcs

fun getBuildType_GradleBuild(uuid_param: String, branch_param: String, vcsroot_param: GitVcsRoot): BuildType {
    var branch_name: String = "";
    if (branch_param.length > 0) {
        branch_name = "${branch_param}Branch"
    }

    return BuildType({
        uuid = uuid_param
        id = "TeamcityTest${branch_name}_Build"
        name = "Build 123"

        vcs {
            root(vcsroot_param)

        }

        steps {
            gradle {
                tasks = "clean build"
                buildFile = ""
                useGradleWrapper = true
                gradleWrapperPath = ""
            }
        }

        triggers {
            vcs {
            }
        }
    })
}

fun getBuildType_GradleClean(uuid_param: String, branch_param: String, vcsroot_param: GitVcsRoot): BuildType {
    var branch_name: String = "";

    if (branch_param.length > 0) {
        branch_name = "${branch_param}Branch"
    }

    return BuildType({
        uuid = uuid_param
        id = "TeamcityTest${branch_name}_Clean"
        name = "Clean 123"

        vcs {
            root(vcsroot_param)

        }

        steps {
            gradle {
                tasks = "clean"
                buildFile = ""
                useGradleWrapper = true
                gradleWrapperPath = ""
            }
        }

        triggers {
            vcs {
            }
        }
    })
}