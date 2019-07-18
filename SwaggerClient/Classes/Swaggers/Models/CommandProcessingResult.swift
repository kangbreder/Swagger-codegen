//
// CommandProcessingResult.swift
//
// Generated by swagger-codegen
// https://github.com/swagger-api/swagger-codegen
//

import Foundation



public struct CommandProcessingResult: Codable {

    public var officeId: Int64?
    public var groupId: Int64?
    public var clientId: Int64?
    public var loanId: Int64?
    public var savingsId: Int64?
    public var subResourceId: Int64?
    public var transactionId: String?
    public var changes: [String:Any]?
    public var productId: Int64?
    public var rollbackTransaction: Bool?

    public init(officeId: Int64?, groupId: Int64?, clientId: Int64?, loanId: Int64?, savingsId: Int64?, subResourceId: Int64?, transactionId: String?, changes: [String:Any]?, productId: Int64?, rollbackTransaction: Bool?) {
        self.officeId = officeId
        self.groupId = groupId
        self.clientId = clientId
        self.loanId = loanId
        self.savingsId = savingsId
        self.subResourceId = subResourceId
        self.transactionId = transactionId
        self.changes = changes
        self.productId = productId
        self.rollbackTransaction = rollbackTransaction
    }


}
