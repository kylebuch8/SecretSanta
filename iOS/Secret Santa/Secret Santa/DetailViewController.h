//
//  DetailViewController.h
//  Secret Santa
//
//  Created by Kyle Buchanan on 12/6/12.
//  Copyright (c) 2012 Kyle Buchanan. All rights reserved.
//

#import <UIKit/UIKit.h>

@interface DetailViewController : UIViewController <UISplitViewControllerDelegate>

@property (strong, nonatomic) id detailItem;

@property (strong, nonatomic) IBOutlet UILabel *detailDescriptionLabel;

@end
