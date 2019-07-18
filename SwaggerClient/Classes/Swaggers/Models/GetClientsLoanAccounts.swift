//
// GetClientsLoanAccounts.swift
//
// Generated by swagger-codegen
// https://github.com/swagger-api/swagger-codegen
//

import Foundation



public struct GetClientsLoanAccounts: Codable {

    public var _id: Int?
    public var accountNo: Int64?
    public var externalId: Int?
    public var productId: Int?
    public var productName: String?
    public var status: GetClientsLoanAccountsStatus?
    public var loanType: GetClientsLoanAccountsType?
    public var loanCycle: Int?

    public init(_id: Int?, accountNo: Int64?, externalId: Int?, productId: Int?, productName: String?, status: GetClientsLoanAccountsStatus?, loanType: GetClientsLoanAccountsType?, loanCycle: Int?) {
        self._id = _id
        self.accountNo = accountNo
        self.externalId = externalId
        self.productId = productId
        self.productName = productName
        self.status = status
        self.loanType = loanType
        self.loanCycle = loanCycle
    }

    public enum CodingKeys: String, CodingKey { 
        case _id = "id"
        case accountNo
        case externalId
        case productId
        case productName
        case status
        case loanType
        case loanCycle
    }


}
