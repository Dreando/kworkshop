package wshop.keywords

// By default class in Kotlin is final

class ImFinalYouCantExtendMe

//class IllTry : ImFinalYouCantExtendMe()

open class ImOpenToExtensions

class ExtendingClass : ImOpenToExtensions()