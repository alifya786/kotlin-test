package Common

import jetbrains.buildServer.configs.kotlin.v2018_1.Project

import jetbrains.buildServer.configs.kotlin.v2018_1.vcs.GitVcsRoot

fun addProjectProperties(project: Project, project_vcsRoot: GitVcsRoot): Unit {

    project.vcsRoot(project_vcsRoot)


}