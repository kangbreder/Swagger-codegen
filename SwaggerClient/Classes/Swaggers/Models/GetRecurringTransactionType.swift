//
// GetRecurringTransactionType.swift
//
// Generated by swagger-codegen
// https://github.com/swagger-api/swagger-codegen
//

import Foundation



public struct GetRecurringTransactionType: Codable {

    public var _id: Int?
    public var code: String?
    public var value: String?
    public var deposit: Bool?
    public var withdrawal: Bool?
    public var interestPosting: Bool?
    public var feeDeduction: Bool?
    public var initiateTransfer: Bool?
    public var approveTransfer: Bool?
    public var withdrawTransfer: Bool?
    public var rejectTransfer: Bool?
    public var overdraftInterest: Bool?
    public var writtenoff: Bool?
    public var overdraftFee: Bool?

    public init(_id: Int?, code: String?, value: String?, deposit: Bool?, withdrawal: Bool?, interestPosting: Bool?, feeDeduction: Bool?, initiateTransfer: Bool?, approveTransfer: Bool?, withdrawTransfer: Bool?, rejectTransfer: Bool?, overdraftInterest: Bool?, writtenoff: Bool?, overdraftFee: Bool?) {
        self._id = _id
        self.code = code
        self.value = value
        self.deposit = deposit
        self.withdrawal = withdrawal
        self.interestPosting = interestPosting
        self.feeDeduction = feeDeduction
        self.initiateTransfer = initiateTransfer
        self.approveTransfer = approveTransfer
        self.withdrawTransfer = withdrawTransfer
        self.rejectTransfer = rejectTransfer
        self.overdraftInterest = overdraftInterest
        self.writtenoff = writtenoff
        self.overdraftFee = overdraftFee
    }

    public enum CodingKeys: String, CodingKey { 
        case _id = "id"
        case code
        case value
        case deposit
        case withdrawal
        case interestPosting
        case feeDeduction
        case initiateTransfer
        case approveTransfer
        case withdrawTransfer
        case rejectTransfer
        case overdraftInterest
        case writtenoff
        case overdraftFee
    }


}
