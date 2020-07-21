package com.github.androidinlondon.translationplugin.services

import com.intellij.openapi.project.Project
import com.github.androidinlondon.translationplugin.MyBundle

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
