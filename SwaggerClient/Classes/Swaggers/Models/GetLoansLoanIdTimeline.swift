//
// GetLoansLoanIdTimeline.swift
//
// Generated by swagger-codegen
// https://github.com/swagger-api/swagger-codegen
//

import Foundation



public struct GetLoansLoanIdTimeline: Codable {

    public var submittedOnDate: Date?
    public var submittedByUsername: String?
    public var submittedByFirstname: String?
    public var submittedByLastname: String?
    public var approvedOnDate: Date?
    public var approvedByUsername: String?
    public var approvedByFirstname: String?
    public var approvedByLastname: String?
    public var expectedDisbursementDate: Date?
    public var actualDisbursementDate: Date?
    public var disbursedByUsername: String?
    public var disbursedByFirstname: String?
    public var disbursedByLastname: String?
    public var expectedMaturityDate: Date?

    public init(submittedOnDate: Date?, submittedByUsername: String?, submittedByFirstname: String?, submittedByLastname: String?, approvedOnDate: Date?, approvedByUsername: String?, approvedByFirstname: String?, approvedByLastname: String?, expectedDisbursementDate: Date?, actualDisbursementDate: Date?, disbursedByUsername: String?, disbursedByFirstname: String?, disbursedByLastname: String?, expectedMaturityDate: Date?) {
        self.submittedOnDate = submittedOnDate
        self.submittedByUsername = submittedByUsername
        self.submittedByFirstname = submittedByFirstname
        self.submittedByLastname = submittedByLastname
        self.approvedOnDate = approvedOnDate
        self.approvedByUsername = approvedByUsername
        self.approvedByFirstname = approvedByFirstname
        self.approvedByLastname = approvedByLastname
        self.expectedDisbursementDate = expectedDisbursementDate
        self.actualDisbursementDate = actualDisbursementDate
        self.disbursedByUsername = disbursedByUsername
        self.disbursedByFirstname = disbursedByFirstname
        self.disbursedByLastname = disbursedByLastname
        self.expectedMaturityDate = expectedMaturityDate
    }


}

