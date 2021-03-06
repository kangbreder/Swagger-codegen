//
// GetAccountsTimeline.swift
//
// Generated by swagger-codegen
// https://github.com/swagger-api/swagger-codegen
//

import Foundation



public struct GetAccountsTimeline: Codable {

    public var submittedOnDate: Date?
    public var submittedByUsername: String?
    public var submittedByFirstname: String?
    public var submittedByLastname: String?
    public var approvedDate: Date?
    public var approvedByUsername: String?
    public var approvedByFirstname: String?
    public var approvedByLastname: String?
    public var activatedDate: Date?

    public init(submittedOnDate: Date?, submittedByUsername: String?, submittedByFirstname: String?, submittedByLastname: String?, approvedDate: Date?, approvedByUsername: String?, approvedByFirstname: String?, approvedByLastname: String?, activatedDate: Date?) {
        self.submittedOnDate = submittedOnDate
        self.submittedByUsername = submittedByUsername
        self.submittedByFirstname = submittedByFirstname
        self.submittedByLastname = submittedByLastname
        self.approvedDate = approvedDate
        self.approvedByUsername = approvedByUsername
        self.approvedByFirstname = approvedByFirstname
        self.approvedByLastname = approvedByLastname
        self.activatedDate = activatedDate
    }


}

