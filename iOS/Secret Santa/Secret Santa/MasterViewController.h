//
//  MasterViewController.h
//  Secret Santa
//
//  Created by Kyle Buchanan on 12/6/12.
//  Copyright (c) 2012 Kyle Buchanan. All rights reserved.
//

#import <UIKit/UIKit.h>

@class DetailViewController;

@interface MasterViewController : UITableViewController

@property (strong, nonatomic) DetailViewController *detailViewController;

@end
