//
// SingleDebitOrCreditEntryCommand.swift
//
// Generated by swagger-codegen
// https://github.com/swagger-api/swagger-codegen
//

import Foundation



public struct SingleDebitOrCreditEntryCommand: Codable {

    public var glAccountId: Int64?
    public var amount: Double?
    public var comments: String?
    public var parametersPassedInRequest: [String]?
    public var glAccountIdChanged: Bool?
    public var commentsChanged: Bool?
    public var glAmountChanged: Bool?

    public init(glAccountId: Int64?, amount: Double?, comments: String?, parametersPassedInRequest: [String]?, glAccountIdChanged: Bool?, commentsChanged: Bool?, glAmountChanged: Bool?) {
        self.glAccountId = glAccountId
        self.amount = amount
        self.comments = comments
        self.parametersPassedInRequest = parametersPassedInRequest
        self.glAccountIdChanged = glAccountIdChanged
        self.commentsChanged = commentsChanged
        self.glAmountChanged = glAmountChanged
    }


}

