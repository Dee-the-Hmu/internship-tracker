USE internshiptracker;

ALTER TABLE applications 
ADD COLUMN status ENUM(
    'APPLIED',
    'TECHNICAL',
    'BEHAVIORAL',
    'REJECTED',
    'OFFER',
    'WITHDRAWN'
) NOT NULL DEFAULT 'APPLIED';