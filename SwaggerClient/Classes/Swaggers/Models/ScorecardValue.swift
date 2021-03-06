//
// ScorecardValue.swift
//
// Generated by swagger-codegen
// https://github.com/swagger-api/swagger-codegen
//

import Foundation



public struct ScorecardValue: Codable {

    public var questionId: Int64?
    public var responseId: Int64?
    public var value: Int?
    public var createdOn: Date?

    public init(questionId: Int64?, responseId: Int64?, value: Int?, createdOn: Date?) {
        self.questionId = questionId
        self.responseId = responseId
        self.value = value
        self.createdOn = createdOn
    }


}

